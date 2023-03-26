# # By Using For Loop
# def reverse(s):
#     str=''
#     for i in s:
#         str = i + str
#     return str

#By Recusrion
def reverse(s):
    if(len(s) == 0):
        return s
    else:
        return reverse(s[1:]) + s[0]

s="shyammehta"
print(reverse(s))
