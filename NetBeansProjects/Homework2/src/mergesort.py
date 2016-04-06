# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

__author__ = "Carlos"
__date__ = "$Feb 10, 2016 7:52:23 AM$"
main = ('__mergesort__' == __name__)

#This class deploys a merge sort 
class MergeList():
    def mergeSort(alist):   
        print("Splitting ",alist)
        if len(alist)>1:
            mid = len(alist)//2
            lefthalf = alist[:mid]
            righthalf = alist[mid:]

            MergeList.mergeSort(lefthalf)
            MergeList.mergeSort(righthalf)

            i=0
            j=0
            k=0

            while i < len(lefthalf) and j < len(righthalf):
                if lefthalf[i] < righthalf[j]:
                    alist[k]=lefthalf[i]
                    i=i+1
                else:
                    alist[k]=righthalf[j]
                    j=j+1
                k=k+1

            while i < len(lefthalf):
                alist[k]=lefthalf[i]
                i=i+1
                k=k+1

            while j < len(righthalf):
                alist[k]=righthalf[j]
                j=j+1
                k=k+1
        print("Merging ",alist)