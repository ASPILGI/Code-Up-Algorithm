a,b = input().split()
z = bool(int(a))
x = bool(int(b))
print((z and not(x)) or (not(z) and x))