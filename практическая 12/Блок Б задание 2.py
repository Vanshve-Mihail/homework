s = []
def f():
    a = int(input())
    s.append(a)
    if a!=0:
        return f()
    else:
        return g()
def g():
    s.remove(max(s))
    return max(s)
print(f())
