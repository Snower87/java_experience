package ru.begletsov.structure_of_data.linkedList.axis_net;

/**
 * @Задание Создание и разбор алгоритма работы односвязанного списка
 * @Описание Структуры данных. Список
 *           ссылка на статью: http://axis.bplaced.net/news/773
 * @author Sergei Begletsov
 * @since 23.04.2021
 * @version 1
 */

public class ListElement {
    /**
     * Каждый элемент списка содержит в себе данные и указатель на следующий элемент.
     * Возьмем простой вариант данных в списке - просто целые числа.
     */

    ListElement next;    // указатель на следующий элемент
    int data;            // данные
}
