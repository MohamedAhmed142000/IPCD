package com.example.ipcd

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestore.*


class LoginActivity: AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference
    private lateinit var db: FirebaseFirestore
    private val users = listOf(
        data.User("main hospital", "#main001", "admin"),
        data.User("student hospital", "#stud002", "user"),
        data.User("om el-kosor hospital", "#omel003", "user"),
        data.User("traume hospital", "#trau004", "user"),
        data.User("new assiut hospital", "#newa005", "user"),
        data.User("pediatric hospital", "#pedi006", "user"),
        data.User("neurology psychiatry hospital ", "#neps007", "user"),
        data.User("urology hospital", "#urol008", "user"),
        data.User("woman hospital", "#woma009", "user"),
        data.User("cardiology hospital", "#card010", "user"),
        data.User("al raghi  hospital", "#alra011", "user"),
        // Add more users as needed
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)


        val editTextEmail: EditText = findViewById(R.id.editTextEmail)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)
        val checkBoxShowPassword: CheckBox = findViewById(R.id.checkBoxShowPassword)
        val buttonLogin: Button = findViewById(R.id.buttonLogin)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance().reference.child("Users")
        db = getInstance()
        // Toggle password visibility when the checkbox is checked/unchecked
        checkBoxShowPassword.setOnCheckedChangeListener { _, isChecked ->
            editTextPassword.transformationMethod =
                if (isChecked) HideReturnsTransformationMethod.getInstance()
                else PasswordTransformationMethod.getInstance()
        }
        buttonLogin.setOnClickListener {
            val username = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            // Validate username and password (replace with your logic)
            if (isValidCredentials(username, password)) {
                val role = getUserRole(username)
                navigateToNextActivity(role)
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        // Replace this with your validation logic (e.g., check against a local database)
        return users.any { user -> user.username == username && user.password == password }
    }

    private fun getUserRole(username: String): String {
        // Replace this with your logic to fetch user role (e.g., from a local database)
        val user = users.firstOrNull { it.username == username }
        return user?.role ?: "user"
    }

    private fun navigateToNextActivity(role: String) {
        val intent = if (role == "admin") {
            Intent(this@LoginActivity, MainActivity::class.java)
        } else {
            Intent(this@LoginActivity, UserActivity::class.java)
        }
        startActivity(intent)
        finish()
        Toast.makeText(this, "Welcome, $role!", Toast.LENGTH_SHORT).show()
    }
}