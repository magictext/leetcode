N -= 1
if N == 0: return [TreeNode(0)]
ans = []
for l in range(1, min(N, 20), 2):
    for left in self.allPossibleFBT(l):
        for right in self.allPossibleFBT(N - l):
            node = TreeNode(0)
            node.left = left
            node.right = right
            
            ans += [node]