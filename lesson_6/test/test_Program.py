from unittest import TestCase
from unittest.mock import Mock

from average_value import Average
from program import Program


class TestProgram(TestCase):
    def test_print_result(self):
        list_1 = [1, 2, 3]
        list_2 = [1, 2, 3]
        avg = Mock()
        program = Program(avg)
        program.print_result(list_1, list_2)
        avg.average.assert_called()

    def test_error_print_result(self):
        list_1 = ["f", 2, 3]
        list_2 = [1, 2, 3]
        avg = Average()
        program = Program(avg)
        with self.assertRaises(TypeError):
            program.print_result(list_1, list_2)
