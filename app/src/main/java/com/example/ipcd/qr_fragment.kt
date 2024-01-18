package com.example.ipcd

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlin.experimental.and


class qr_fragment : Fragment() {

    private lateinit var editText: EditText
    private lateinit var imageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_qr_fragment, container, false)

        editText = view.findViewById(R.id.editTextUrl)
        val generateButton: Button = view.findViewById(R.id.buttonGenerateQR)
        imageView = view.findViewById(R.id.imageViewQR)

        generateButton.setOnClickListener {
            generateQRCode()
        }

        return view
    }

    private fun generateQRCode() {
        val textToEncode = editText.text.toString()
        if (textToEncode.isNotEmpty()) {
            val bitmap = generateQRCodeBitmap(textToEncode, 500, 500)
            imageView.setImageBitmap(bitmap)
        }
    }

    private fun generateQRCodeBitmap(text: String, width: Int, height: Int): Bitmap {
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val paint = Paint()
        paint.color = Color.BLACK

        // Convert the text to a byte array using ASCII encoding
        val bytes = text.toByteArray()
        val byteLength = bytes.size

        // Calculate the step size needed to divide the image based on the desired size
        val stepX = width / byteLength.toFloat()
        val stepY = height / 8.0f

        // Draw the data into the image
        for (i in 0 until byteLength) {
            for (j in 0 until 8) {
                if (bytes[i] and ((1 shl j).toByte()) != 0.toByte()) {
                    canvas.drawRect(
                        i * stepX, j * stepY,
                        (i + 1) * stepX, (j + 1) * stepY, paint
                    )
                }
            }
        }

        return bitmap
    }
}