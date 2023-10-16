from average_value import Average


class Program:

    def __init__(self, avg: Average):
        self.average = avg

    def print_result(self, list_1, list_2):
        num = self.average.average(list_1, list_2)
        if num == 1:
            print("Первый список имеет большее среднее значение")
        if num == 0:
            print("Средние значения равны")
        if num == -1:
            print("Второй список имеет большее среднее значение")
