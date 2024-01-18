package compose.tms.notes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById<Button>(R.id.ConnectButton)
        button.setOnClickListener {

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        val button : Button = findViewById (R.id.add_new_acc)
            button.setOnClickListener {

            val intent = Intent (this,LoginActivity::class.java)
        startActivity(intent)
            }

        }
    }
}