visit = set()

        cur = head

        while cur:
            if cur in visit:
                return True

            visit.add(cur)
            cur = cur.next
        return False