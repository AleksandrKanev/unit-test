import average_value
from program import Program

list_1 = ["f", 2, 3]
list_2 = [1, 2, 3]
avg = average_value.Average()
program = Program(avg)
program.print_result(list_1, list_2)
print(avg.average(list_1, list_2))
