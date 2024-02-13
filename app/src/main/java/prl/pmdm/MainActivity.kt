package prl.pmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pedidoButton: Button = findViewById<Button>(R.id.empezarPedidoButton)
        pedidoButton.setOnClickListener{
            val intent = Intent(this, PedidoActivity::class.java)
            startActivity(intent)
        }
    }
}