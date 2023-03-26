def checkpalindrome(s):
    for i in range(0,int(len(s)/2)):
        if(s[i] != s[len(s)-i-1]):
            return False
    return True
    
s="malayalam"
ans = checkpalindrome(s)

if(ans):
    print('true')
else:
    print('false')
