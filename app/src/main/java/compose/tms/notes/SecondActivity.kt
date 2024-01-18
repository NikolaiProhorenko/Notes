package compose.tms.notes

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        findViewById<Button>(R.id.BackToMainActy).setOnClickListener {
        onBackPressed()
        }

        val button : Button = findViewById<Button>(R.id.goNext)
        button.setOnClickListener {

        val intent = Intent (this,FirstListInfActivity::class.java)
            startActivity(intent)

        }
    }
}
