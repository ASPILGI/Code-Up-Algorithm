a,b,c = map(int, input().split())
z=0
for i in range(a):
  for j in range(b):
    for k in range(c):
      print(i,j,k)
      z+=1

print(z)