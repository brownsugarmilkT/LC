if root == None:
            return 0

        l, r = 0,0

        if root.right!= None:
            r = 1 + self.maxDepth(root.right)
        else:
            r+=1
        if root.left!= None:
            l = 1 + self.maxDepth(root.left)
        else:
            l+=1
        return max(l,r)
