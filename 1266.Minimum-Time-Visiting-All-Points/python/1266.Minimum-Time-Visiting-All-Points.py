def minTimeToVisitAllPoints(points):
    l = len(points)
    result = 0
    for i in range(1, l):
        point_a = points[i-1]
        point_b = points[i]
        diff_x = abs(point_a[0]-point_b[0])
        diff_y = abs(point_a[1]-point_b[1])
        result += max(diff_x, diff_y)
        
    return result

points = [[1,1],[3,4],[-1,0]]
print(minTimeToVisitAllPoints(points))
points = [[3,2],[-2,2]]
print(minTimeToVisitAllPoints(points))

