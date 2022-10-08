class Node:
   def __init__(self, data=None):
      self.data = data
      self.next = None

class LL:
   def __init__(self):
      self.head = None

   def getList(self):
      value = self.head
      while value is not None:
         print (value.data)
         value = value.next

list = LL()
list.head = Node("Week1")
e2 = Node("Week2")
e3 = Node("Weeek3")

# Link first Node to second node
list.head.next = e2

# Link second Node to third node
e2.next = e3

list.getList()