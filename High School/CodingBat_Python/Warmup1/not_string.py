'''
Created on Sep 26, 2013

@author: Rajat
'''
def not_string(str):
    if str[:3] == 'not':
        return str
    return 'not ' + str