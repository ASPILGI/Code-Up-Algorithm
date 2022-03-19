h,w = map(int,input().split())

list = []
for i in range(h+1) :
    list.append([])
    for j in range(w+1) :
        list[i].append(0)

n = int(input())
for i in range(n) :
    l,d,x,y = input().split()
    if int(d)==0 :
        for j in range(int(l)):
            list[int(x)][int(y)+j] = 1
    else :
        for j in range(int(l)) :
            list[int(x)+j][int(y)] = 1

for i in range(1, h+1) :
    for j in range(1, w+1) :
        print(list[i][j], end=' ')
    print()

////////////////////