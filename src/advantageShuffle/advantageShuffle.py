def quickSort(L, low, high):
    i = low
    j = high
    if i >= j:
        return L
    key = L[i]
    while i < j:
        while i < j and L[j] >= key:
            j = j-1
        L[i] = L[j]
        while i < j and L[i] <= key:
            i = i+1
        L[j] = L[i]
    L[i] = key
    quickSort(L, low, i-1)
    quickSort(L, j+1, high)
    return L

A = [0,7,17,11,15]
B = [1,10,4,16,11]
print(B)
A.sort()
a=[]
b=B[:]
b.sort()
#print(b)
t=0
map={}
for i in range(0,len(A)):
    #print("{}\t{}".format(A[i],b[t]))
    if A[i]>b[t]:
        #print(b[t])
        index=B.index(b[t])
        B[index]=0-A[i]
        #print(index)
        t=t+1
    else:
        a.append(A[i])
print(a)
for i in range(t,len(A)):
    index = B.index(b[i])
    B[index] = a.pop()
for i in range(0,len(B)):
    if B[i]<0:
        B[i]=0-B[i]
print(t)
print(B)
