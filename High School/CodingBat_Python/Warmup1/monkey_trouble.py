'''
Created on Mar 21, 2013

@author: Rajat
'''

def monkey_trouble(a_smile, b_smile):
  return a_smile == b_smile

print monkey_trouble(True, True)  # true
print monkey_trouble(False, True)  # false
print monkey_trouble(True, False)  # false
print monkey_trouble(False, False)  # true
