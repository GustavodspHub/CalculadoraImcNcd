package br.senai.sp.jandira.imcapp20

import android.util.Log
import java.util.*
import kotlin.math.log

fun getDicaDoDia(): String{
    val dicas = listOf<String>(
        "Evite gorduras animais saturadas encontrados no leite integral, queijos amarelos, creme de leite, banha e pele de aves.",
        "Retire toda a gordura visível das carnes antes de cozinhá-las.",
        "Não espere ter sede para beber água. Quando você tem sede, significa que o corpo já está desidratado.",
        "Coma verduras de folhas verde escuras como brócolis, couve, espinafre, pois contém bioflavonoides, substâncias que interferem no metabolismo das gorduras.",
        "Evite açúcar e farinha branca."
    )

    val aleatorio = Random()
    val dica = aleatorio.nextInt(dicas.size)

    return dicas[dica]
}