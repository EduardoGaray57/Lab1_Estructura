import pytest
from src.ListaCircular import CircularLinkedList

# Basic creation test
def test_initial_list_empty():
    list = CircularLinkedList()
    assert list.is_empty() is True
    assert list.size() == 0

# Insert many elements
def test_insert_many_elements():
    list = CircularLinkedList()
    for i in range(100):
        list.insertLast(i)
    
    assert list.is_empty() is False
    assert list.size() == 100

# Insert by position
def test_insert_by_start_position():
    list = CircularLinkedList()
    list.insertLast(1)
    list.insertLast(2)
    list.insertByPosition(0, 0)  # Insert at the beginning

    assert list.first.data == 0
    assert list.size() == 3

def test_insert_by_intermediate_position():
    list = CircularLinkedList()
    list.insertLast(1)
    list.insertLast(3)
    list.insertByPosition(1, 2)  # Insert at position 1

    assert list.size() == 3
    assert list.first.next.data == 2

def test_insert_by_position_out_of_range():
    list = CircularLinkedList()
    list.insertLast(1)
    list.insertByPosition(10, 2)  # Insert at position out of range

    assert list.last.data == 2
    assert list.size() == 2

# Delete until empty
def test_delete_until_empty():
    list = CircularLinkedList()
    for i in range(5):
        list.insertLast(i)
    for i in range(5):
        assert list.remove(i) is True
    
    assert list.is_empty() is True
    assert list.size() == 0

#Remove non-existent element
def test_delete_non_existent_element():
    list = CircularLinkedList()
    list.insertLast(1)

    assert list.remove(99) is False
    assert list.size() == 1

# Simulation of errors / misuse
def test_remove_on_empty_list():
    list = CircularLinkedList()
    assert list.remove(1) is False

def test_display_empty_list(capsys):
    list = CircularLinkedList()
    list.display()
    captured = capsys.readouterr()
    assert "empty" in captured.out.lower()

def test_insert_and_eliminate_single_node():
    list = CircularLinkedList()
    list.insertLast(1)

    assert list.remove(1) is True
    assert list.is_empty() is True