n = int(input())
k = list(map(int, input().split()))

min = k[0]
for i in range(0, n) :
  if k[i] < min :
    min = k[i]

print(min)