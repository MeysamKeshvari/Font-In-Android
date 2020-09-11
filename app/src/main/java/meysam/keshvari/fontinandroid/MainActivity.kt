package meysam.keshvari.fontinandroid

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val typeface = Typeface.createFromAsset(assets,"calibri.ttf")
        //textView.typeface = typeface

        // or
        val typeface = ResourcesCompat.getFont(this,R.font.b_titr_bold)
        textView.typeface = typeface

    }
}