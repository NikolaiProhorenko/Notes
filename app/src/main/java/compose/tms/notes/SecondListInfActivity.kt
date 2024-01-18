package compose.tms.notes

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class SecondListInfActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_list_inf)
        findViewById<Button>(R.id.go_back_first_inf).setOnClickListener {
            onBackPressed()
        }



        val button2 : Button = findViewById(R.id.go_to_registration)
        button2.setOnClickListener {

        val intent2 = Intent (this,RegistrationActivity::class.java)
        startActivity(intent2)
        }


    }
}