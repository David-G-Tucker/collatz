#performs a single collatz step
from datetime import datetime


def collatzStep(number):
    if number % 2 == 0:
        return number / 2
    else:
        return number * 3 + 1

#calculates the number of steps required to reach 1
def collatzStepCount(number, steps):
    if number == 1:
        return steps
    else:
        return collatzStepCount(collatzStep(number), steps + 1)

#calculates number of steps required for starting numbers from 1 up to given max
def collatzStepCalculateUpTo(number):
    results = []
    for n in range(1, number):
        count = collatzStepCount(n, 0)
        results.append(count)
        print(n, " = ", count)

# TEST CASES
print(collatzStep(2) == 1)
print(collatzStep(3) == 10)
print(collatzStep(4) == 2)
print(collatzStep(5) == 16)

print(collatzStepCount(2, 0) == 1)
print(collatzStepCount(4, 0) == 2)
print(collatzStepCount(5, 0) == 5)

# MAIN
upto = 100000
start = datetime.now()
collectzStepCalculateUpTo(upto)
end = datetime.now()
print('Computed up to', upto, 'collatz numbers in', end - start)