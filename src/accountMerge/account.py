class Solution(object):
    def accountsMerge(self, accounts):
        """
        :type accounts: List[List[str]]
        :rtype: List[List[str]]
        """
        groups = {}
        counter = 1
        for account in accounts:
            name = account[0]
            email_set = set(account[1:])
            gset = set()
            for email in email_set:
                if email not in groups:
                    groups[email] = counter
                gset.add(groups[email])
            if len(gset) > 1:
                self.union(groups, gset)
            counter += 1
        #print(groups)
        return self.reStruct(accounts, groups)
    
    def reStruct(self, accounts, groups):
        ht = {}
        for k, v in groups.items():
            if v not in ht:
                ht[v] = []
            ht[v].append(k)
        ht2 = {}
        for account in accounts:
            name = account[0]
            email = account[1]
            gid = groups[email]
            ht2[gid] = name
        ret = []
        for k, v in ht.items():
            ret.append([ht2[k]] + sorted(v))
        return ret
            
    def union(self, groups, gset):
        gid = gset.pop()
        for k, v in groups.items():
            if v in gset:
                groups[k] = gid
        return