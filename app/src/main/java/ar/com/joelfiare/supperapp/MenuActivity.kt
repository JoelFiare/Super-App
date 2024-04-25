package ar.com.joelfiare.supperapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ar.com.joelfiare.supperapp.superapp.SuperListActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnTODO = findViewById<Button>(R.id.btnTODO)

        btnTODO.setOnClickListener { navigateToTodoApp() }

    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, SuperListActivity::class.java)
        startActivity(intent)
    }
}