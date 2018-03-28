package top.com.mykkk

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val datas= arrayListOf<String>(
                "切尔奇无",
                "艾尔艾尔",
                "安达市大",
                "人体风格",
                "和豆腐干",
                "呵呵让人",
                "大概多少",
                "企鹅企鹅"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }


    private fun initUI() {
        input.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }


        })
        show.adapter=Myadapter(this,datas)
        show.layoutManager=LinearLayoutManager(this)

    }



}


