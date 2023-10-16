import pytest

import average_value


@pytest.mark.parametrize("l_1, l_2, expended", [((1, 2, 3), (1, 2, 3), 0),
                                                ((1, 2, 3), (1, 2, 4), -1),
                                                ((1, 2, 4), (1, 2, 3), 1)])
def test_average(l_1, l_2, expended):
    avg = average_value.Average()
    assert avg.average(l_1, l_2) == expended
