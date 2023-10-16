1) Отчет pylint (venv) PS C:\Users\Kanev\Desktop\Unit-test\lesson_6> pylint .\test\test_average_value.py\
    ************* Module test_average_value\
    test\test_average_value.py:1:0: C0114: Missing module docstring (missing-module-docstring)\
test\test_average_value.py:4:0: E0401: Unable to import 'average_value' (import-error)\
test\test_average_value.py:10:0: C0116: Missing function or method docstring (missing-function-docstring)\
(venv) PS C:\Users\Kanev\Desktop\Unit-test\lesson_6> pylint .\test\test_Program.py\      
************* Module test_Program\
test\test_Program.py:1:0: C0114: Missing module docstring (missing-module-docstring)\
test\test_Program.py:1:0: C0103: Module name "test_Program" doesn't conform to snake_case naming style (invalid-name)\
test\test_Program.py:4:0: E0401: Unable to import 'average_value' (import-error)\
test\test_Program.py:5:0: E0401: Unable to import 'program' (import-error)\
test\test_Program.py:8:0: C0115: Missing class docstring (missing-class-docstring)\
test\test_Program.py:9:4: C0116: Missing function or method docstring (missing-function-docstring\
test\test_Program.py:17:4: C0116: Missing function or method docstring (missing-function-docstring)\
2) Coverage доступен только в профессиональной версии.
