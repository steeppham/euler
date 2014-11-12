# Project Euler
# Problem 2: Even Fibonacci Numbers
# 09/11/14

n = 4000000 # number of terms in fib sequence
a = 1 # n - 2 number in fib sequence
b = 1 # n - 1 number in fib sequence
i = 3 # start at 3 since f1 = 1, f2 = 1
sum = 0 # sum even terms in fib sequence

# Every 3rd number in fibonacci sequence is an even number

# recursive function that calculates fibonacci numbers of i terms, f1 = 1 and f2 = 1
# def fib(i):
# 	if i <= 2:
# 		return 1
# 	return fib(i-2) + fib(i-1)

#print fib(n)

# slower loop method
while b <= n:
	temp = b
	b += a
	a = temp
	if b % 2 == 0:
		sum += b

print sum
