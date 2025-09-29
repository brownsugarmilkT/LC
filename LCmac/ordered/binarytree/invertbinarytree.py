def recurse(node):

            if node == None:
                return 
            temp = node.right
            node.right = node.left
            node.left = temp
            recurse(node.right)
            recurse(node.left)

        recurse(root)
        return root