from datetime import datetime

results = [1, 0]    # pre-populate collatz steps for 0 to reach 1 (1 step) and for 1 to reach 1 (0 steps)


# performs a single collatz step
def collatz_step(number):
    if (number == 0) or (number % 2 == 1):
        return number * 3 + 1
    else:
        return number / 2


# calculates the number of steps required to reach 1
def part_optimized_collatz_step_count(number, steps):
    if number < len(results):
        return steps + results[int(number)]
    else:
        return part_optimized_collatz_step_count(collatz_step(number), steps + 1)


# calculates number of steps required for starting numbers from 2 up to given max
def part_optimised_collatz_step_calculate_up_to(number):
    for n in range(2, number + 1):  # start at 2 as we prepopulated the value for 0 and 1
        count = part_optimized_collatz_step_count(n, 0)
        if n >= len(results):
            results.append(count)
        print(n, " = ", count)


# calculates the number of steps required to reach 1
def collatz_step_count(number, steps):
    if number == 1:
        return steps
    else:
        return collatz_step_count(collatz_step(number), steps + 1)


# calculates number of steps required for starting numbers from 1 up to given max
def collatz_step_calculate_up_to(number):
    slow_results = []
    for n in range(1, number + 1):
        count = collatz_step_count(n, 0)
        slow_results.append(count)
        print(n, " = ", count)


# TEST CASES
print('step test 2', collatz_step(2) == 1)
print('step test 3', collatz_step(3) == 10)
print('step test 4', collatz_step(4) == 2)
print('step test 5', collatz_step(5) == 16)

print("non optimised count test 2", collatz_step_count(2, 0) == 1)
print("non optimised count test 4", collatz_step_count(4, 0) == 2)
print("non optimised count test 5", collatz_step_count(5, 0) == 5)

# MAIN
upto = 100000
start = datetime.now()
part_optimised_collatz_step_calculate_up_to(upto)
end = datetime.now()
print('Computed up to', upto, 'collatz numbers in', end - start)

for n in range(upto - 10, upto + 1):
    print('parity test', n, part_optimized_collatz_step_count(n, 0) == collatz_step_count(n, 0))