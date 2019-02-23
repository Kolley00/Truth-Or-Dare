package com.example.truthordare

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {
    val mygameList2 = arrayListOf("Если выбирать из нашей компании, с какой девушкой ты пойдешь на свидание?", "Когда ты первый раз по-настоящему поцеловал девушку?", "Когда-нибудь врал своей девушке? Если да, то о чем?")
    val mygameList3 = arrayListOf("Укуси зубами нослк человека и потяни его как собака", "Подержи два или три кубика льда во рту на протяжении минуты.", "Внезапно закричи на ухо незнакомцу.", "Сделай рандомный звонок из телефонной книги в твоем смартфоне и поговори минуту или две", "Спародируй своего лучшего друга.", "Расскажи один из своих секретов", "Подойди к незнакомцу и признайся в любви.",
        "Поцелуй в пупок девушку стоящую или сидящую возле тебя", "Поменяйся  любой одеждой с сидящим напротив", "Облизни родинку рядом сидящей девушки", "Иди на кухню и съешь один из продуктов, который не принято употреблять отдельно (перец чили, свежую луковицу, пару зубчиков чеснока и т.д.)", "Прокати на спине игрока, сидящего слева от тебя.", "Лизни пол", "Напиши письмо человеку, которого ты ненавидишь, и отправь ему")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        TruthButton1.setOnClickListener{
            val random = java.util.Random()
            val randomProgram = random.nextInt(mygameList2.count())

            textView5.text = mygameList2[randomProgram]
        }

        DareButton1.setOnClickListener{
            val random = java.util.Random()
            val randomProgram = random.nextInt(mygameList3.count())

            textView5.text = mygameList3[randomProgram]
        }
    }
}
