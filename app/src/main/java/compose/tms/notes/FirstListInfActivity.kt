package compose.tms.notes

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class FirstListInfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_list_inf)
        findViewById<Button>(R.id.back_to_sec_act).setOnClickListener {
            onBackPressed()
        }

        val button: Button = findViewById(R.id.go_Next_sec_inf)
        button.setOnClickListener {

        val intent = Intent (this,SecondListInfActivity::class.java)
        startActivity(intent)
        }

    }
}