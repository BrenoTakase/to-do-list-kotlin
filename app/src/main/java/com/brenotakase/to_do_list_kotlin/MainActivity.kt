package com.brenotakase.to_do_list_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.brenotakase.to_do_list_kotlin.navigation.AppNavigation
import com.brenotakase.to_do_list_kotlin.ui.theme.TodolistkotlinTheme
import com.brenotakase.to_do_list_kotlin.viewmodel.TarefaViewModel
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodolistkotlinTheme {
                val viewModel: TarefaViewModel = viewModel(
                    factory = TarefaViewModel.factory(applicationContext)
                )
                AppNavigation(viewModel = viewModel)
            }
        }
    }
}