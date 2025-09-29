cur = head

        arr = []

        cur = head
        while cur:
            arr.append(cur)
            cur = cur.next

        i=0
        j = len(arr)-1
        while i < j:
            arr[i].next = arr[j]
            i+=1
            arr[j].next = arr[i]
            j-=1

        arr[i].next = None