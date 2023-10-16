from statistics import mean


class Average:

    def average(self, list_1, list_2):

        if mean(list_1) > mean(list_2):
            return 1
        if mean(list_1) == mean(list_2):
            return 0
        if mean(list_1) < mean(list_2):
            return -1
