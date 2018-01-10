'''
Created on Sep 26, 2013

@author: Rajat
'''
def pos_neg(a, b, negative):
    if (negative and a < 0 and b < 0) or (not negative and ((a < 0 and b > 0) or (a > 0 and b < 0))):
        return True
    return False