#!/usr/bin/env python
""" generated source for module BinaryGap """
# package: codility
#import java.lang

#class BinaryGap(object):
#    """ generated source for class BinaryGap """
#    @classmethod

def main():
    """ generated source for method main """
    #  TODO Auto-generated method stub
    sol = solution(100)

#    @classmethod
def solution(N):
    """ generated source for method solution """
    #  write your code in Java SE 8
    print N
    #s = Integer.toBinaryString(N)
    s = "{0:b}".format(N)
    print s
    #  check for 1s
    #bc = Integer.bitCount(N)
    bc = s.count("1")
    if bc <= 1:
        return 0
    #  check for 0s
    if s.count("0") <= 0:
        return 0
    #  example 1000010001, 10100
    #c = s.toCharArray()
    c = list(s)
    prevGap = 0
    gap = 0
    started = False
    ended = True
    i = 0
    idx = 0
    while i < len(s):
        #System.out.format("%d %c\n", i, c[i])
        print("%d %c" % (i, c[i]))
        if c[i] == '1':
            #  find the next '1'
            #idx = s.indexOf('1', i + 1)
            idx = s.index('1', i + 1)

            #System.out.format("idx: %d\n", idx)
            print("idx: %d" % idx)
            if idx > i:
                gap = idx - i
            else:
                gap = 1
                #  just move to the next character
            i += gap
        else:
            i += 1
    return gap


if __name__ == '__main__':
    import sys
    main()

