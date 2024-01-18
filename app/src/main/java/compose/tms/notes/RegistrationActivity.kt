package compose.tms.notes

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class RegistrationActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

    val button : Button = findViewById (R.id.go_to_login)
    button.setOnClickListener {

    val intent= Intent (this,LoginActivity::class.java)
    startActivity(intent)

    }
    }
}