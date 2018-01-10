'''
Created on Apr 5, 2013

@author: Rajat
'''

def parrot_trouble(talking, hour):
    if talking == True and (hour < 7 or hour > 20):
        return True
    
    return False