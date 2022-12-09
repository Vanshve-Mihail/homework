a = int(input())
b = int(input())
def f(a):
    if a <= b:
        print(a)
        return f(a+1)
print(f(a))
