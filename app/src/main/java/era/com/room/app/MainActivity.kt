package era.com.room.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

import era.com.room.app.room.data.User
import era.com.room.app.room.data.UserViewModel

class MainActivity : AppCompatActivity() {
    private  lateinit var userViewModel:UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        var usr = User(0,"Enamul","Haque",34,"")
        userViewModel.addUser(usr)
    }
}