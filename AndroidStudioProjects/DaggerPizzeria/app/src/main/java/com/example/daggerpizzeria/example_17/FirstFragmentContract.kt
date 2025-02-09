package com.example.daggerpizzeria.example_17

interface FirstFragmentContract {
    // Метод для обработки клика по кнопке отправки данных
    // Принимает выбранный тип пиццы в качестве параметра
    fun onButtonSendDataClicked(pizzaType: String)
}