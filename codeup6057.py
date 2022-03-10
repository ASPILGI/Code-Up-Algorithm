a,b = input().split()
z = bool(int(a))
x = bool(int(b))
print((z and x) or ((not z) and (not x)))