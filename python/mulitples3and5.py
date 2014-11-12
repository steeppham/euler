# Project Euler
# Problem 1: Multiples of 3 and 5
# 09/11/14
import math

a = 3
b = 5
sum = 0
n = 1000

# Natural number range is 0-999 (since less than maximal 1000).
# Find sum of numbers divisble by 3 that is less than 1000, 
# add to sum of numbers divisble by 5 that is less than 1000, substract from
# sum of numbers divisble by 15 that is less than 1000
# Makes use of arithmetic series and sum equations

# find the sum of numbers divisble by d that is less than N
def summ(d, N):
	n = math.floor((N - 1)/d + 1)
	return int(n/2*(n-1)*d)

print summ(a, n) + summ(b, n) - summ(a*b, n)

# slower loop method
# for i in range(n):
# 	if (i % 3 == 0) or (i % 5 == 0):
# 		sum += i

# print sum