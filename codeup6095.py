a = []
for i in range(20):
  a.append([])
  for j in range(20):
    a[i].append(0)

n = int(input())
for i in range(n):
  x,y = map(int, input().split())
  a[x][y] = 1

for i in range(1, 20):
  for j in range(1, 20):
    print(a[i][j], end=' ')
  print()

///////////////////////////////////////////

d=[[0 for i in range(20)]for i in range(20)]
n=int(input())
for i in range(n):
  x,y=map(int,input().split())
  d[x][y]=1

for i in range(1,20):
  for j in range(1,20):
    print(d[i][j],end=' ')
  print()
