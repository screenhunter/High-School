'''
Created on Mar 21, 2013

@author: Rajat
'''

def sleep_in(weekday, vacation):
    return not weekday or vacation

print sleep_in(True, True)  # true
print sleep_in(False, True)  # true
print sleep_in(True, False)  # false
print sleep_in(False, False)  # true
